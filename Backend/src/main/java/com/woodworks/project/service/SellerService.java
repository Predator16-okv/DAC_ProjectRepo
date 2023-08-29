package com.woodworks.project.service;

import java.util.List;
import java.util.Optional;

import com.woodworks.project.entities.Seller;
import com.woodworks.project.models.SellerDto;

public interface SellerService {

	Seller registerSeller(SellerDto sellerDto);

	Seller validate(String email, String password);

	List<Seller> findAllSellers();

	Optional<Seller> findSellerById(int id);

	void updateProfile(Seller seller, int id);

	Seller findByEmail(String email);

	void resetPassword(Seller seller, String password);

	void deleteSellerById(Integer id);

}
