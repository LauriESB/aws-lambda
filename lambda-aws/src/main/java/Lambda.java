import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class Lambda implements RequestHandler<Void, Map<String, Object>> {
  @Override
  public Map<String, Object> handleRequest(Void input, Context context) {
    Map<String, Object> response = new HashMap<>();
    response.put("statusCode", 200);
    response.put("body", "Hellow Terraform");

    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "text/plain");
    response.put("headers", headers);

    return response;

  }

}
