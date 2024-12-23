package com.project.dsa;

import com.project.dsa.arrays.MaxSumSubArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
		MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
		int [] nums = {5,4,-1,7,8};
		System.out.println(maxSumSubArray.maxSubArray(nums));
	}

}
