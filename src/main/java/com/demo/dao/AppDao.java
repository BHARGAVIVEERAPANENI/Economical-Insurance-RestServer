package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

@Repository
public class AppDao {

	@Autowired
    private MongoTemplate mongoTemplate;
	

	public User getUserInfo(int userId, String email) {
		Criteria criteria = new Criteria();
		criteria.orOperator(Criteria.where("userId").is(userId),Criteria.where("email").is(email));
		Query query = new Query(criteria);
		System.out.println(query.toString());

		return mongoTemplate.findOne(query,User.class);
	}
}
