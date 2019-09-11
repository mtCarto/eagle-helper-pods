package specs

import Pages.Public.HomePage
import Pages.Public.WelcomePage

import spock.lang.Title
import spock.lang.Stepwise
import spock.lang.Narrative

@Stepwise
@Title('Test home page loads')
@Narrative('''as dev I want to see this run in browserstack''')
class HomePageSpec extends BaseSpec {

  void 'The Welcome modal displays on first visit to EPIC'() {
    given: 'I browse to the main page'
      to WelcomePage
    expect: 'Verify welcome content'
      verifyWelcomeContent()
    when: 'I see and close the welcome splash'
      clickCloseButton()
    then: 'I am at the home page'
      at HomePage
  }
}
