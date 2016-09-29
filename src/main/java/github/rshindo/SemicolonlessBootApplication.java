package github.rshindo;

@org.springframework.boot.autoconfigure.SpringBootApplication
@org.springframework.stereotype.Controller
public class SemicolonlessBootApplication {

	public static void main(String[] args) {
		if(java.util.stream.IntStream
				.range(0, 1)
				.peek(i -> org.springframework.boot.SpringApplication.run(SemicolonlessBootApplication.class, args))
				.count() == 0) {}
	}
	
	@org.springframework.web.bind.annotation.RequestMapping(value="/")
	public void index(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
		try(java.io.PrintWriter writer = new java.io.PrintWriter(resp.getOutputStream())) {
			if(writer.printf("semicolonless Boot!", null) == null) {}
		}
	}
	
}
