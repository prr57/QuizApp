package upload;

import java.io.File;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class UploadToBucket {

	public static void main(String[] args) {

		AWSCredentials credentials = new BasicAWSCredentials("AKIAJAVWPHFDW7THVPOQ", "SiPELJqQC1m6h8Kg73f4otz3HnT1qMGaVFXtdmEe");
		AmazonS3 s3client = new AmazonS3Client(credentials);
		
		
		String fileName = "Xylophone2.jpg";
		s3client.putObject(new PutObjectRequest("musicquizresources", fileName, new File("C:\\Users\\user\\Desktop\\Java Project\\Xylophone2.jpg")));
	
		
	}

}