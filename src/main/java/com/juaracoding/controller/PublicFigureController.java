package com.juaracoding.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.juaracoding.model.PublicFigureModel;
import com.juaracoding.utility.FileUtility;

@RestController
@RequestMapping("/figure")
public class PublicFigureController {
	List<PublicFigureModel> model = new ArrayList<>();
	String[] listmodel = new String[5];
	
	/*
	 * localhost:8080/figure/
	 * endpoint untuk save model berserta gambar nya
	 */
	@PostMapping("/")
	private String saveData(@RequestParam(name="file") MultipartFile file,
			@RequestParam(name="data") String figureModel) throws IOException {
		Gson gson = new Gson();
		PublicFigureModel figure = gson.fromJson(figureModel,PublicFigureModel.class);
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		String uploadDir = "foto-figure";
		
		figure.setFoto(fileName);
		FileUtility.simpanFile(uploadDir, fileName, file);
		model.add(figure);

		return "Berhasil disimpan" ;
	}
	
	@GetMapping("/")
	private List<PublicFigureModel> getAllData(){
//		listmodel[0]="data1";
//		for (String string : listmodel) {
//			System.out.println(string);
//		}
//		
//		listmodel[1]="data2";
//		for (String string : listmodel) {
//			System.out.println(string);
//		}
//		listmodel[2]="data3";
//		for (String string : listmodel) {
//			System.out.println(string);
//		}
//		listmodel[3]="data4";
//		for (String string : listmodel) {
//			System.out.println(string);
//		}
		tambahDataKeArray(1, "mantap");
		tambahDataKeArray(1, "mantap");
		tambahDataKeArray(1, "mantap");
		tambahDataKeArray(1, "mantap");
		tambahDataKeArray(1, "mantap");
		tambahDataKeArray(1, "mantap");
		tambahDataKeArray(1, "mantap");
		return model;
	}
	
	public void tambahDataKeArray(int indeks,String nilai) {
		listmodel[indeks]=nilai;
		for (String string : listmodel) {
			System.out.println(string);
		}
	}
	
}
