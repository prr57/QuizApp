package upload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudsearchdomain.model.Bucket;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;

public class GetBuckets {

	public static void main(String[] args) {

		AWSCredentials credentials = new BasicAWSCredentials("AKIAJAVWPHFDW7THVPOQ", "SiPELJqQC1m6h8Kg73f4otz3HnT1qMGaVFXtdmEe");
		AmazonS3 s3client = new AmazonS3Client(credentials);
		
//		String bucketName = "testcreatebucket";
//		s3client.createBucket(bucketName);
		
//		String fileName = "Xylophone2.jpg";
//		s3client.putObject(new PutObjectRequest("musicquizresources", fileName, new File("C:\\Users\\user\\Desktop\\Java Project\\Xylophone2.jpg")));
	
		GetObjectRequest request = new GetObjectRequest("musicquizresources", "Xylophone2.jpg");
		S3Object object = s3client.getObject(request);
		S3ObjectInputStream objectContent = object.getObjectContent();
		try {
			IOUtils.copy(objectContent, new FileOutputStream("C://Users//user//Desktop//Java Project//test.jpg"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
