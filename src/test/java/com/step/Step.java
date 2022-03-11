package com.step;
xddfknefs.
import com.stepdef.page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step extends page {

	@Given("Usefgr is on amazon page")
	public void usefgr_is_on_amazon_page() {
		 page p = new page();
		    p.launch();
	}
//unale mudiyathendru oore sollum nambathe!
	@When("user text in search box and click search button")
	public void user_text_in_search_box_and_click_search_button() throws InterruptedException {
		page p = new page();
		p.search();
	}
thanga
	@When("user should select one mobile phone")
	public void user_should_select_one_mobile_phone() {
		page p = new page();
		p.mbclk();
	}

	@Then("user should perfordfm mouse hover action in next window")
	public void user_should_perfordfm_mouse_hover_action_in_next_window() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	@Given("Useredfhgf is on amazonfd page")
	public void useredfhgf_is_on_amazonfd_page() {
		 page p = new page();
		    p.launch();
	}

	@When("user text in searchgf box and click searccxh button")
	public void user_text_in_searchgf_box_and_click_searccxh_button() throws InterruptedException {
	  page p = new page();
	  p.search1();
	}

	@When("user should selec{int}t one sdfamsung phone")
	public void user_should_selec_t_one_sdfamsung_phone(Integer int1) {
	    page p = new page();
	    p.nokiaclk();
	}

	@Then("user should perform{int}hf df hover action in next window")
	public void user_should_perform_hf_df_hover_action_in_next_window(Integer int1) throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	@Given("Userhgh is on amazonsed page")
	public void userhgh_is_on_amazonsed_page() {
		page p = new page();
	    p.launch();
	}

	@When("user text in searchwe box and click segfarch button")
	public void user_text_in_searchwe_box_and_click_segfarch_button() throws InterruptedException {
	   page p = new page();
	   p.search2();
	}

	@When("user should selectgf one saxfmsung phone")
	public void user_should_selectgf_one_saxfmsung_phone() {
	    page p = new page();
	    p.samsungclk();
	}

	@Then("user should performghh modsduse hover action in next window")
	public void user_should_performghh_modsduse_hover_action_in_next_window() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	@Given("Usertrr is on amazondfh page")
	public void usertrr_is_on_amazondfh_page() {
		page p = new page();
	    p.launch();
	}

	@When("user text in searchsd box and click seanhrch button")
	public void user_text_in_searchsd_box_and_click_seanhrch_button() throws InterruptedException {
	   page p = new page();
	   p.search3();
	}

	@When("user should selectqew one samsubbng phone")
	public void user_should_selectqew_one_samsubbng_phone() {
	    page p = new page();
	    p.redmiclk();
	}

	@Then("user should performyr mobfhuse hover action in next window")
	public void user_should_performyr_mobfhuse_hover_action_in_next_window() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}



}
