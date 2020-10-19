package com.facebookComments.CommentsRetrive.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebookComments.CommentsRetrive.Dao.FacebookRestDao;
import com.facebookComments.CommentsRetrive.Entity.FacebookComments;
import com.facebookComments.CommentsRetrive.Entity.SubComments;

@Service
public class FacebookRestServiceImpl implements FacebookRestService {

	private FacebookRestDao facebookRestDao;
	
	@Autowired
	public FacebookRestServiceImpl(FacebookRestDao facebookRestDao) {
		this.facebookRestDao = facebookRestDao;
	}

	@Override
	public List<FacebookComments> getServiceComments() {
		return facebookRestDao.findAll();
	}

	@Override
	public Optional<FacebookComments> getServiceById(int id) {
		return facebookRestDao.findById(id);
	}

	@Override
	public void saveInService(FacebookComments facebookComments) {
		facebookRestDao.save(facebookComments);
	}

	@Override
	public void updateInService(int id, FacebookComments facebookComments) {
	
		if(facebookRestDao.findById(id).isPresent()) {
			FacebookComments face = facebookRestDao.findById(id).get();
			face.setFirstName(facebookComments.getFirstName());
			face.setComments(facebookComments.getComments());	
			if(face.getSubcomments().isEmpty()) {
		    face.setSubcomments(facebookComments.getSubcomments());
			}else {
				List<SubComments> listAll = face.getSubcomments();
				listAll.addAll(facebookComments.getSubcomments());
				face.setSubcomments(listAll);
			}
			facebookRestDao.save(face);
		}
		else
		{
			facebookRestDao.save(facebookComments);
		}
	}

}
