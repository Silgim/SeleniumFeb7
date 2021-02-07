package kdf;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automationpractice.scripts.Base;

import utils.GenericMethod;

public class ApplicationClass extends Base {
	@Test
	public void checkInvalidLogin() throws IOException {
	String[][] data = GenericMethod.getData("D:\\\\DataKey.xlsx","Sheet2");	
	MethodClass mtd=new MethodClass();
	for(int i=1;i<data.length;i++) {
		//Making to changes to the class after Release1.1
		switch(data[i][3]) {
		case "openBrowser":
			mtd.OpenBrowser();
			break;
		case "maxBrowser":
		mtd.MaxBrowser();
		break;
		case "impWait":
			mtd.impWait();
			break;
		case "navApp":
			mtd.navigateApp(data[i][6]);
			break;
		case "clickButton":
			mtd.clickBtn(data[i][5]);
			break;
		case "enterUnameTextBox":
			mtd.enterUnameText(data[i][5], data[i][6]);
			break;
		case "enterPassTextBox":
		mtd.enterPasText(data[i][5], data[i][6]);
		break;
		case "clickBtn":
			mtd.clickButton(data[i][5]);
			break;
		case "verifyErrMsg":
			mtd.verifyErMsg(data[i][5], data[i][6]);
			break;
		case "closeApp":
			mtd.closeApp();
			break;
		}
	}
	
	}

}
