package com.xyh.game.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.cache.annotation.Cacheable;*/
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.xyh.game.comm.Constants;
import com.xyh.game.dao.UserDao;
import com.xyh.game.dao2.CardDao;
import com.xyh.game.model.User;
import com.xyh.game.req.TestReq;
import com.xyh.game.res.ResResultEntity;
import com.xyh.game.res.ResTestEntity;

@RestController
public class Usercontroller {
	@Autowired 
	UserDao userDao;
	@Autowired
	CardDao cardDao; 
	@RequestMapping(value = "/api/user/test", method = RequestMethod.POST)
	//@Cacheable(value="user-key")
	public ResResultEntity test(@Valid @RequestBody TestReq reqEntity,BindingResult result,
			HttpServletRequest request) {
		//RequestContext requestContext = new RequestContext(request);
		ResTestEntity resultEntity = new ResTestEntity();
		
		resultEntity.setResultCode(Constants.ResultCode.ERROR);
		if (result.hasErrors()) {
			resultEntity.setMessage(result.getAllErrors().get(0).getDefaultMessage());
			return resultEntity;
		}
		User user = userDao.findByUsername(reqEntity.getName());
		resultEntity.setUser(user);
		resultEntity.setResultCode(Constants.ResultCode.OK);
		return resultEntity;		
	}


}
