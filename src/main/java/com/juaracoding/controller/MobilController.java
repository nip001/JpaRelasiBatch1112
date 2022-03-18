package com.juaracoding.controller;

import java.io.IOException;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.juaracoding.model.MobilModel;
import com.juaracoding.utility.FileUtility;

@RestController
@RequestMapping("/mobil")
public class MobilController {
	
	//GETMAPPING Sederhana dengan endpoint / aksesnya : localhost:8080/mobil/
	@GetMapping("/")
	private int getMapp() {
		return 100;
	}

	/*GETMAPPING Sederhana dengan endpoint /endpoint2
	aksesnya : localhost:8080/mobil/endpoint2
	*/
	@GetMapping("/endpoint2")
	private int getMapping() {
		return 130;
	}


	/*GETMAPPING Sederhana dengan endpoint / + path variabel {nama}
	aksesnya : localhost:8080/mobil/anu,localhost:8080/mobil/kevin
	*/
	// localhost:8080/mobil/panggil/Tessy?data=mantap
	@GetMapping("/panggil/{nama}/{id}")
	private String getMappingPath(@PathVariable("nama") String nama,
			@PathVariable("id") String id,
			@RequestParam(name = "data",defaultValue = "trainernya ganteng") String data) {
		char huruf = nama.charAt(0);
		return "id "+id+" Hello! "+ nama +" huruf depan = " + huruf+" "+data;
	}
	
//	@PostMapping("/")
//	public String saveAndGetMobil(@RequestBody MobilModel data) {
//		data.setTahun(0000);
//		return "selamat anda berhasil menyimpan data";
//	}
	
	/*
	 * Belajar Request param akses variable melalui key dan value pada endpoint
	 * localhost:8080/mobil/requestparam?data=anu
	 * localhost:8080/mobil/requestparam?data=asik
	 * localhost:8080/mobil/requestparam?data=asik&data2=mantap&data3=anu
	 */
	@PostMapping("/")
	private String getDataRequestParam(
			@RequestParam(name = "data",defaultValue = "trainernya ganteng") String data,
			@RequestParam(name = "data2",defaultValue = "juaracoding mantap") String data2,
			@RequestParam(name = "data3",defaultValue = "anuan") String data3) {
		
		return data + data2 +data3;
	}
	
	
	@PostMapping("/upload")
	private String uploadDokumen(@RequestParam(name="file") MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		String uploadDir="dokumen-mobil";
		FileUtility.simpanFile(uploadDir, fileName, file);
		return "Berhasil menyimpan dokumen";
	}
}
