package pages

class CreateProjectGroupModal extends BaseAppPage {
  static at = { pageTitle.text() == 'Add Group' }
  static content = {
    // todo revisit this selector
    modalSelector(wait:true) { $('.btn .btn-success') }

    pageTitle { modalSelector.$('.modal-header h2') }

    yesButton { modalSelector.$('#modal-yes') }
  }
}