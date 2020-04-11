$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NavigationToMainPage.feature");
formatter.feature({
  "name": "Navigation to the Main Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Users should be able to navigate to the Main Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationToMainPageStepDefs.the_user_navigates_to_the_Main_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Main page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationToMainPageStepDefs.the_ain_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SearchFeatureMainPage.feature");
formatter.feature({
  "name": "To be able to make a search on a specific category",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationToMainPageStepDefs.the_user_navigates_to_the_Main_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should be able to search a specific category",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "the users select \"Books\" category",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_select_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enter \"Selenium\" in search box",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_enter_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users hit Search button",
  "keyword": "When "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_hit_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users get results in \"Book\" category",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_get_results_in_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationToMainPageStepDefs.the_user_navigates_to_the_Main_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Users should be able to search a specific category",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "the users select \"Books\" category",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_select_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enter \"Selenium\" in search box",
  "keyword": "And "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_enter_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users hit Search button",
  "keyword": "When "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_hit_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users get results containing \"selenium\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFeatureMainPageStepDefs.the_users_get_results_containing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});