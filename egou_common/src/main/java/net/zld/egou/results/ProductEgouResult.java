package net.zld.egou.results;


public class ProductEgouResult {
	 // 响应业务状态
    //200 成功,400 找不到数据,500 出异常
    private Integer status;

    // 响应消息
    private String msg;


	private ProductResult data;

	public ProductResult getData() {
		return data;
	}

	public void setData(ProductResult data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
