package cn.itcast.bos.web.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.domain.Workordermanage;
import cn.itcast.bos.web.action.base.BaseAction;
/**
 * 工作单操作Action
 */
@Controller
@Scope("prototype")
public class WorkordermanageAction extends BaseAction<Workordermanage>{
	/**
	 * 保存工作单
	 * @throws IOException 
	 */
	public String save() throws IOException{
		String flag = "1";
		try{
			workordermanageService.save(model);
		}catch (Exception e) {
			flag = "0";
		}
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		ServletActionContext.getResponse().getWriter().print(flag);
		return NONE;
	}
}
