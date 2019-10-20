package net.zld.egou.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import net.zld.egou.entity.EFeature;
import net.zld.egou.entity.EProduct;
import net.zld.egou.entity.EType;
import net.zld.egou.results.EgouResult;
import net.zld.egou.results.ProductResult;
import net.zld.egou.service.EBrandService;
import net.zld.egou.entity.EBrand;
import net.zld.egou.service.EFeatureService;
import net.zld.egou.service.EProductService;
import net.zld.egou.service.ETypeService;
import net.zld.egou.web.SessionProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class RestController {

    @Resource
    private EBrandService brandService;

    @Resource
    private ETypeService typeService;

    @Resource
    private EFeatureService featureService;

    @Resource
    private SessionProvider sessionProvider;

    @Resource
    private EProductService productService;

    /**
     * 请求路径：http://192.168.146.128:8081/rest/brandList
     * 返回数据格式：
     * {
     * status: 200 //200 成功,400 找不到数据,500 出异常
     * msg: "OK" // 返回信息消息
     * data: [
     * {id:xxx,name:xxx,… },
     * {id:xxx,name:xxx, }
     * ]
     * <p>
     * }
     */
    @RequestMapping("/rest/brandList")
    @ResponseBody
    public EgouResult getBrandList() {
        try{
            List<EBrand> brands = brandService.selectList(null);
            return EgouResult.build(200,"8001,ok",brands);
        }catch(Exception ex){
            ex.printStackTrace();
            return EgouResult.build(501,"8001,error,"+ex.getMessage());
        }
    }

    @RequestMapping("/rest/typeList")
    @ResponseBody
    public EgouResult getTypeList() {
        try{
            List<EType> types = typeService.selectList(null);
            return EgouResult.build(200,"8001,ok",types);
        }catch(Exception ex){
            ex.printStackTrace();
            return EgouResult.build(501,"8001,error,"+ex.getMessage());
        }
    }

    @RequestMapping("/rest/featureList")
    @ResponseBody
    public EgouResult getFeatureList() {
        try{
            List<EFeature> features = featureService.selectList(null);
            return EgouResult.build(200,"8001,ok",features);
        }catch(Exception ex){
            ex.printStackTrace();
            return EgouResult.build(501,"8001,error"+ex.getMessage());
        }
    }

    @RequestMapping("/rest/productAndImg")
    @ResponseBody
    public Object getProductAndImg(Integer current,Integer number) {

        Page<Map<String, Object>> page=productService.diyProductAndImg(current,number);

        return page;

    }

    /**
     * 请求url:http://192.168.146.128:8081/rest/productList
     * 请求参数：
     * pageNo Integer
     * brandId Integer
     * typeId Integer
     * featureId Integer
     * 响应数据格式：
     * {
     * 	status: 200 //200 成功,400 找不到数据,500 出异常
     * 	msg: "OK" // 返回信息消息
     * 	data: {"params":xxx,
     * 		"productItems":[…],
     * 		"pagination":{…}
     *        }
     * }
     * @return
     */
    //该方法是做组合搜索或者分页时被调用
    @RequestMapping("/rest/productList")
    @ResponseBody
    public EgouResult getProductList(Integer current,Integer number, Integer brandId, Integer typeId, Integer featureId, HttpServletRequest request, HttpServletResponse response){
        //判断之前是否有保存过查询条件，如果有保存过查询条件，就将之前的查询条件提取出来，加到分页查询中

        //queryConditions：用来保存查询条件
        HashMap<String,Integer> queryConditions = (HashMap<String, Integer>) sessionProvider.getAttribute(request,response,"query_product_conditions");
        if(queryConditions==null){
            queryConditions = new HashMap<String,Integer>();
        }
        //向queryConditions存放查询条件
        if(brandId!=null){
            if(brandId==-1){
                queryConditions.remove("brandId");
            }else{
                queryConditions.put("brandId",brandId);
            }
        }
        if(typeId!=null){
            if(typeId==-1){
                queryConditions.remove("typeId");
            }else{
                queryConditions.put("typeId",typeId);
            }
        }
        if(featureId!=null){
            if(featureId==-1){
                queryConditions.remove("featureId");
            }else{
                queryConditions.put("featureId",featureId);
            }
        }

        sessionProvider.setAttribute(request,response,"query_product_conditions",queryConditions);

        try{
            EntityWrapper<EProduct> eProductEntityWrapper = new EntityWrapper<>();
            StringBuilder params = new StringBuilder();
            //将查询条件加到example
            brandId = (Integer)queryConditions.get("brandId");
            if(brandId!=null && brandId!=-1){
                eProductEntityWrapper.eq("brand_id",brandId);
//                params.append("&brandId=").append(brandId);
            }
            typeId = (Integer)queryConditions.get("typeId");
            if(typeId!=null && typeId!=-1){
                eProductEntityWrapper.eq("type_id",typeId);
//                params.append("&typeId=").append(typeId);
            }
//            featureId = (Integer)queryConditions.get("featureId");
//            if(featureId!=null && featureId!=-1){
//
//            }

            ProductResult result = productService.diyProductItemList(eProductEntityWrapper,current,number);
//            result.setParams(params.toString());
            return EgouResult.build(200,"ok",result);
        }catch(Exception ex){
            ex.printStackTrace();
            return EgouResult.build(501,"exception");
        }
    }


}

