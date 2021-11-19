import { Role, Selector } from "testcafe";
import registerFill from "../page_object/registerFill";

fixture `Register Page Test Suite`
  .page `http://localhost:4200/register-page`;

/* test http://localhost:4200/register-page */
const fullNameRegistry = "TestCafe Name";
const emailRegistry = "testcafe.test@gmail.com";
const passwordRegistry = "123abcA@";
const rePasswordRegistry = "123abcA@";
const addressRegistry = "Ben Tre";

test("Verify register successful", async (t) => {
  await registerFill.typeFullName(fullNameRegistry);
  await registerFill.typeEmail(emailRegistry);
  await registerFill.typePassword(passwordRegistry);
  await registerFill.typeRePassword(rePasswordRegistry);
  await registerFill.typeAddress(addressRegistry);
  await registerFill.submitRegister();
  await t.navigateTo("/login-page");
  await t.wait(5000);
});

test
  .page `http://localhost:4200/register-page`
  ("Verify register failed",
  async (t) => {
    await registerFill.typeFullName("test");
    await registerFill.typeEmail("emailRegistry");
    await registerFill.typePassword("passwordRegistry");
    await registerFill.typeRePassword("rePasswordRegistry");
    await registerFill.typeAddress("addressRegistry");
    await registerFill.submitRegister();
    await t.expect(Selector('p').withAttribute('class', 'errors').innerText).notEql(" ");
  }
);


