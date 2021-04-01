import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class security1 {
@RequestMapping("/")
public String hello() {
	return "<h1>Hello<h1>";
}
}