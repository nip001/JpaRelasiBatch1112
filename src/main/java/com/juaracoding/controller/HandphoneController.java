package com.juaracoding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.HandphoneModel;

@RestController
@RequestMapping("/hp")
public class HandphoneController {
	List<HandphoneModel> hplist = new ArrayList<>();

	/*
	 * Method akan di akses melalui url localhost:8080/hp/motorola dengan method POST
	 * output nya adalah : Merk hp kamu adalah motorola
	 */
	@PostMapping("/cari/{merk}")
	private String cariMerk(@PathVariable("merk") String merk) {
		String kalimat = "Merk hp kamu adalah " +merk;
		return kalimat;
	}
	
	@PostMapping("/requestparam")
	private String cariHarga(@RequestParam(name="harga") int harga) {
		String kalimat = "Harga hp kamu adalah "+harga;
		return kalimat;
	}
	
	@PostMapping("/")
	private String saveHandphone(@RequestBody HandphoneModel hp) {
		hplist.add(hp);
		return "berhasil disimpan";
	}
	
	@GetMapping("/")
	private List<HandphoneModel> getAllHp(){
		return hplist;
	}
}
