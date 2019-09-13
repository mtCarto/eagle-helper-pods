package Pages.Admin

import geb.Page

import Admin.modules.HeaderModule
import Admin.modules.ModalModule
import Admin.modules.FooterModule
import Admin.modules.SideBarModule

/**
 * Base app page where global selectors and modules used by all pages can be added.
 *
 * All pages should extend this page.
 */
class BaseAppPage extends Page {
  static content = {
    headerModule { module(HeaderModule) }
    modalModule { module(ModalModule) }
    footerModule { module(FooterModule) }
    sidebarModule { module(SideBarModule) }
  }
  static url = {'/admin'}
}
