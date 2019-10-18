package net.zld.egou.controller;


import net.zld.egou.service.EBrandService;
import net.zld.egou.entity.EBrand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;


@Controller
public class RestController {

    @Resource
    private EBrandService brandService;

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
    public List<EBrand> getBrandList() {
       /* try{
            List<EBrand> brands = brandService.selectByExample(new EBrandExample());
            //查询redis缓存中是否有品牌列表数据，如果有，就从缓存中加载，没有就从数据库查找，从数据库加载数据之后，要把数据放到redis中
            EgouResult result = EgouResult.build(200,"8083,ok",brands);
            return result;
        }catch(Exception ex){
            ex.printStackTrace();
            EgouResult result = EgouResult.build(501,"8083,error,"+ex.getMessage());
            return result;
        }*/

        List<EBrand> brands = brandService.selectList(null);
        return brands;
    }


}

