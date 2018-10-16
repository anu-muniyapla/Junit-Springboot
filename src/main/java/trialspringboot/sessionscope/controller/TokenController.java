package trialspringboot.sessionscope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import trialspringboot.sessionscope.Datacontainer;

@RestController
public class TokenController {
	
		@Autowired
		Datacontainer dc;  
	
		@RequestMapping("token")
		public String sayhi(@RequestParam String token) {
			dc.showw();
			return token;
		}
		
		@RequestMapping("settoken")
		public void store(@RequestParam String token)
		{ 
			 dc.setToken(token);
		}
		
		@RequestMapping("gettoken")
		public String fetch()
		{ 
			String token = dc.getToken();
			return token;
			
		}			
}
