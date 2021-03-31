package cap.q6.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontController {
	@Autowired
	RestTemplate template;
	@Autowired
	CalService service;

		
	
	@RequestMapping(value = "/consume/substract", method=RequestMethod.POST)
	public String add(@RequestBody TwoNums tn) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <TwoNums> entity = new HttpEntity<TwoNums>(tn,headers);
		return template.exchange("http://localhost:8080/substractResult", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/substractResult",method = RequestMethod.POST)
	public long check(@RequestBody TwoNums tn) {
		return service.subtract(tn.getN1(), tn.getN2());
	}

	@RequestMapping(value = "/consume/multiply", method=RequestMethod.POST)
	public String add(@RequestBody TwoNums tn) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <TwoNums> entity = new HttpEntity<TwoNums>(tn,headers);
		return template.exchange("http://localhost:8080/multiplyResult", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/multiplyResult",method = RequestMethod.POST)
	public long check(@RequestBody TwoNums tn) {
		return service.multiply(tn.getN1(), tn.getN2());
	}

	@RequestMapping(value = "/consume/divide", method=RequestMethod.POST)
	public String add(@RequestBody TwoNums tn) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <TwoNums> entity = new HttpEntity<TwoNums>(tn,headers);
		return template.exchange("http://localhost:8080/divideResult", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/divideResult",method = RequestMethod.POST)
	public double check(@RequestBody TwoNums tn) {
		return service.division(tn.getN1(), tn.getN2());
	}

	@RequestMapping(value = "/consume/add", method=RequestMethod.POST)
	public String add(@RequestBody TwoNums tn) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <TwoNums> entity = new HttpEntity<TwoNums>(tn,headers);
		return template.exchange("http://localhost:8080/addResult", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/addResult",method = RequestMethod.POST)
	public long check(@RequestBody TwoNums tn) {
		return service.add(tn.getN1(), tn.getN2());
	}


}