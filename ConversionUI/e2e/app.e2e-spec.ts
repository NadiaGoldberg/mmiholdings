import { ConversionPage } from './app.po';

describe('conversion App', () => {
  let page: ConversionPage;

  beforeEach(() => {
    page = new ConversionPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
