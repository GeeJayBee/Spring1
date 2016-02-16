package uk.me.bourke.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Worker {

	@Autowired
	Fetcher fetcher;
	
	void doWork() {
		System.out.println(fetcher.getName());
	}

}
