package interview.stuff;

public class WhatIsCohesion {

	public static void main(String[] args) {
		
	}
}
//this is not cohesive
//class only should have 1 reason to change
class DownloadAndStore {
	void downloadFromInternet()
	{
		
	}
	
	void parseData() {
		
	}
	
	void storeInDb() {
		
	}
	
	void doEverything()
	{
		downloadFromInternet();
		parseData();
		storeInDb();
		
	}
}



class InternetDownloader {
	public void download()
	{
		
	}
}

class Parser {
	public void parse()
	{
		
	}
}

class DatabaseStorer {
	public void storeInDb()
	{
		
	}
}

class DownloadAndStorage {
	public DownloadAndStorage() {
		new InternetDownloader().download();
		new Parser().parse();
		new DatabaseStorer().storeInDb();
	}
}