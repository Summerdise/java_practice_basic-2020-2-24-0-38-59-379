import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import java.io.*;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {
    //TODO: change the code to pass the test
    String jsonString = "{\"name\":\"Solider\",\"age\":19}";
    try {
      Person person = objectMapper.readValue(jsonString, Person.class);
      jsonString = objectMapper.writeValueAsString(person);
    } catch (JsonParseException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      return jsonString;
    }
  }
}
