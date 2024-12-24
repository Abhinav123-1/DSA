package com.project.dsa;

import com.project.dsa.arrays.MaxSumSubArray;
import com.project.dsa.arrays.RemoveDuplicates;
import com.project.dsa.arrays.TwoSum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
		//MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
		//TwoSum ts = new TwoSum();
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		int [] nums = {1,1,1,2,2,3,4,4};
	//	int target = 9;
		System.out.println(removeDuplicates.removeDuplicates(nums));
	}

}
