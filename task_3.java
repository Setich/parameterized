@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	 this.age = age;
     this.result = result; 
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
        {17, false},
        {18, true},
        {20, true},
        {21, true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Если возраст больше 18 то будет true", result, isAdult);
	}
}
