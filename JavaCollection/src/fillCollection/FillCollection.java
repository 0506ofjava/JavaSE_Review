package fillCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yq
 * @description
 * @create 2019-13-17-00
 */
public class FillCollection {

  public static void main(String[] args) {
    FillCollection fillCollection = new FillCollection();
    fillCollection.fillCollectionShow();
  }

  public void fillCollectionShow() {
    // 使用nCopies方法和fill方法产生的对象实际上只有一个
    List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("hello")));
    System.out.println(list);

    Collections.fill(list, new StringAddress("world"));
    System.out.println(list);
  }
}

class StringAddress {
  private String s;

  public StringAddress(String s) {
    this.s = s;
  }

  @Override
  public String toString() {
    return super.toString() + "" + s;
  }
}
