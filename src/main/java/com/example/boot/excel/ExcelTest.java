package com.example.boot.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019/12/14 3:25 PM
 */
public class ExcelTest {

  public static void main(String[] args) {
    ExcelTest excelTest = new ExcelTest();
    excelTest.test();
  }

  public void test() {
    String fileName = System.currentTimeMillis() + ".xlsx";
    EasyExcel.write(fileName, DemoData.class).withTemplate("template.xlsx").sheet().doWrite(data());

//    ExcelWriter excelWriter = EasyExcel.write(fileName, DemoData.class).build();
//    WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
//    excelWriter.write(data(), writeSheet);
//    /// 千万别忘记finish 会帮忙关闭流
//    excelWriter.finish();


  }


  private List<DemoData> data() {
    List<DemoData> list = new ArrayList<DemoData>();
    for (int i = 0; i < 10; i++) {
      DemoData data = new DemoData();
      data.setString("字符串" + i);
      data.setDate(new Date());
      data.setDoubleData(0.56);
      list.add(data);
    }
    return list;
  }

}
