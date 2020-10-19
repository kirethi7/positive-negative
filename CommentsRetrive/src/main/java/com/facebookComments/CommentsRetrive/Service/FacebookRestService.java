package com.facebookComments.CommentsRetrive.Service;

import java.util.List;
import java.util.Optional;

import com.facebookComments.CommentsRetrive.Entity.FacebookComments;

public interface FacebookRestService {

	public List<FacebookComments> getServiceComments();

	public Optional<FacebookComments> getServiceById(int id);

	public void saveInService(FacebookComments facebookComments);

	public void updateInService(int id, FacebookComments facebookComments);
}
