package reflectShow;

/**
 * @author yq
 * @description
 * @create 2019-18-00-20
 */
public class TestObject {
  private int intTest;
  private String stringTest;
  private boolean booleanTest;

  public TestObject(){

  }

  public TestObject(int intTest){
    this.intTest=1;
  }

  public TestObject(int intTest,String stringTest){
    this.intTest=2;
    this.stringTest="stringTest";
  }

  public void methodTest1() {
    System.out.println("methodTest1");
  }

  public void methodTest1(int intTest){
    System.out.println("methodTest1:"+intTest);
  }

  public String methodTest1(int intTest,String stringTest){
    System.out.println("methodTest1:"+intTest);
    return stringTest;
  }

  public void methodTest2(){
    System.out.println("methodTest2");
  }


    public int getIntTest() {
        return intTest;
    }

    public void setIntTest(int intTest) {
        this.intTest = intTest;
    }

    public String getStringTest() {
        return stringTest;
    }

    public void setStringTest(String stringTest) {
        this.stringTest = stringTest;
    }

    public boolean isBooleanTest() {
        return booleanTest;
    }

    public void setBooleanTest(boolean booleanTest) {
        this.booleanTest = booleanTest;
    }
}
