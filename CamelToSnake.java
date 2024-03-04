

class SnakeCase{
	public String camelToSnake(String str) {
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if(Character.isUpperCase(currentChar)) {
				if(i>0) {
					result.append('_');
				}
				result.append(Character.toLowerCase(currentChar));
			}
			else {
				result.append(currentChar);
			}
		}
		return result.toString();
	}
}



public class CamelToSnake {

	public static void main(String[] args) throws Exception {
		
		SnakeCase snakeCase = new SnakeCase();
		String camelCaseString = "DoSelect";
		String snakeCaseString = snakeCase.camelToSnake(camelCaseString);
		System.out.println(snakeCaseString);
		
	}
}

