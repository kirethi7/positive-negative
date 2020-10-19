package com.facebookComments.CommentsRetrive.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebookComments.CommentsRetrive.Entity.FacebookComments;
import com.facebookComments.CommentsRetrive.Service.FacebookRestService;

@RestController
@RequestMapping("/Comments")
public class FacebookRestController {

	private FacebookRestService facebookRestService;
	
	@Autowired	
	public FacebookRestController(FacebookRestService facebookRestService) {
		this.facebookRestService = facebookRestService;
	}

	@GetMapping("/all")
	public List<FacebookComments> getAllComments() {
		return facebookRestService.getServiceComments();	
	}
	
	@GetMapping("/commentby/{id}")
	public Optional<FacebookComments> getCommentbById(@PathVariable int id){
		return facebookRestService.getServiceById(id);
	}
	
	@PostMapping("/insert")
	public FacebookComments insertComments(@RequestBody FacebookComments facebookComments){
		facebookComments.setId(0);
		facebookRestService.saveInService(facebookComments);
		return facebookComments;
	}
	
	@PutMapping("/update/{id}")
	public FacebookComments updateComments(@PathVariable int id, @RequestBody FacebookComments facebookComments) {
		facebookRestService.updateInService(id, facebookComments);
		return facebookComments;
	}
}
