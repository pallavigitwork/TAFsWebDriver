from seleniumbase import SB
with SB(test=True, uc=True) as sb:
    sb.open("https://5elementslearning.dev/demosite/")
    sb.click_link("My Account")
    sb.assert_text("Welcome, Please Sign In")


