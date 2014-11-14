package com.haodingdan.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by tgj on 2014/11/14.
 */
@ParentPackage("struts-default")
@Namespace("/")
public class TestAction extends ActionSupport {

    public String execute() throws Exception {
        return SUCCESS;
    }

    @Action(value = "Test_add",results = {@Result(name = "success",location = "/success.jsp"),@Result(name = "error",location = "/error.jsp")})
    public String add(){
        return SUCCESS;
    }
}
