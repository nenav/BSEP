package xml.services;

import java.util.List;

import xml.web_services.Accomodation;
import xml.web_services.Review;

public interface ReviewService {

	Review save(Review review);
	List<Review> findByAccomodation(Accomodation accomodation);
	boolean approve(Review review);
	boolean decline(Review review);
	List<Review> findAll();
	
}
