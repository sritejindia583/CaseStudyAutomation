package com.foster.code;

import java.io.BufferedWriter;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

public class LoggerClass {
	
	private static Path file;
	SimpleDateFormat simpleDataFormat;

	public LoggerClass() {
		simpleDataFormat = new SimpleDateFormat("yyyy-MM-dd");
		file = Paths.get(System.getProperty("user.dir") + "/resultLog - "
				+ simpleDataFormat.format(new Date()) + (new Random()).nextInt(100) + ".txt");
		try {
			if(!Files.exists(file))
				Files.createFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in creating file");
			e.printStackTrace();
		}
	}
	
	public static void log(String strLog) {
		try(FileWriter fw = new FileWriter(file.toString(), true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))	{
			    	out.println(strLog);
		} catch (IOException e) {
			return;
		}
	}
}
