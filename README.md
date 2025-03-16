# پروژه بانک 🏦💸💰
### درود کران‌دار!
توی این تمرین میخوایم همراه میلیاردر‌های معروف دنیا بانک بزنیم!🥷🏻🏴‍☠️
## bank package
## **classes:**
### &nbsp; Bank Account
#### ایشون کلاسی پدر و abstract هستند 😊.
- اولا فیلد های گفته شده اسم و شماره حساب و موجودی با حالت گفته شده (public, protected, private) ساخته می‌شن.
- کانستراکتور اطلاعات رو می‌دریافته.
- متد `calculateInterest` که abstract هست رو تعریف می‌کنیم تا بچه‌ها زورکی هم که شده بدنه این بنده خدا رو تشکیل بدن.
- متدهای `deposit` و `withdraw` رو برای واریز و برداشت تعریف می‌کنیم و برای واریز و برداشت‌هایی که مشکل داشته باشن پیام مناسب ارائه می‌دهیم.
- با getter‌هایی که سازیدیم اطلاعات فوق محرمانه‌ای رو که داریم می‌شه مشاهده نمود.
---
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Saving Account
#### کودک پس‌اندازی 💵
- فرزند اول ابتدا فیلد `interestRate` رو به صورت یه final بسیار هیجانی درصد سود تعلق گرفته رو درش می‌نویسیم.
- حالا در کانستراکتور پدر لطف می‌کنن با super کار رو در می‌آورند.
- و وقتی که دیگه چیزی نمونده به آخرین خطوط این class برسیم متد `calculateInterest` رو override می‌کنیم و سود رو با متد `deposit` به حساب واریز می‌کنیم.
---
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Transaction Account
#### کودک جاری 🌊
- فرزند دوم فیلد `overDraftLimit` رو final می‌تعریفن.
- کانستراکتورش از پدر طلب super می‌کنه.
- متد `calculateInterest` رو override می‌کنیم و توش می‌گیم عزیز دلم سود مود یوخدی!
- عه چرا `withdraw` رو داریم override می‌نماییم؟؟ 😭😭 چون می‌خوایم بشه تا اون حد تعیین شده بتونه بیشتر برداشت کنه.
---
### Bank Customers
#### نوبت تأسیس بانک رسیده! 🎉🎊
- بانک ما یه لیست داره که اطلاعات کل مشتری‌ها رو می‌نویسه توش این لیست رو تعریف می‌نماییم.
- براش کانستراکتوری تعریف نمی‌کنیم تا کانستراکتور رو مهمون جاوا باشیم 🥰🥰.
- با متد `addAccount` اکانت‌ها رو به بانک معتبرمون اضافه می‌کنیم و با متد `showAllBalances` اطلاعات با ارزش تک تک مشتری های مهربون‌مون رو چاپ می‌کنیم.
- متد `findAccount` یه شماره حساب می‌گیره بعد می‌گرده هی می‌گرده اونقدر می‌گرده تا یه حساب با این شماره پیدا کنه و اون حساب رو return کنه و اگه پیدا نکرد هم می‌گه پیدا نکردم بفرمایید null عزیزم.
## Main
#### رسیدیم به آخر خط 😭
- چون بانک ملی اسپانسر بنده شدن برای این تمرین بانک ملی رو می‌سازیم.
- و چون که 6 تا میلیارد هم اسپانسر بنده شدن برای این تمرین مراجع‌هامون هم اینا هستن.
- اضافه می‌کنیم‌شون به بانک ملی!
- خب اول با متد `findAccount` می‌گردیم دنبال اون حساب‌هایی که شماره‌اشون رو بهش دادیم.
- بعدش ایلان ماسک یه واریزی انجام می‌ده و بیل گیتس هم یه برداشت اشتباهی.
- با متد `calculateInterest` سود دو تا حساب صدا زده می‌شه که یکی از اون‌ها جاری هست و پیام مناسب رو نشان می‌ده.
- حالا یک عالم برداشت و واریزی عه صحیح و غلط و ناموجود انجام می‌دیم.
- در پایان هم اطلاعات فوق محرمانه همه رو چاپ می‌کنیم 🥰🥰.
## خروجی کد:
```
========================================
Account found successfully.
Account Information:
Account Holder Name: Steve Jobs
Account Number: 6037
Balance: $800000.0

No account with 6043 account number was found.
========================================

****************************************
Elon Musk Balance: $1000000.0
Deposited $500000.0 to Elon Musk account.
Elon Musk balance is now $1500000.0

You can't deposit negative amount.
****************************************

----------------------------------------
Steve Jobs Saving account profit:
Deposited $24000.0 to Steve Jobs account.
Steve Jobs balance is now $824000.0

There is no interest available for transaction account.
----------------------------------------

########################################
$300000.0 has been withdrawn from Steve Jobs account.
Steve Jobs balance is now $524000.0

You can't withdraw less than balance.

You can't withdraw negative or zero amount.

$80000.0 has been withdrawn from Jeff Bezos account.
Jeff Bezos balance is now $620000.0

You can't withdraw less than balance plus overdraft limit.

You can't withdraw negative or zero amount.
########################################

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
Account details:

Account Holder Name: Steve Jobs
Account Number: 6037
Balance: $524000.0

Account Holder Name: Bill Gates
Account Number: 6038
Balance: $500000.0

Account Holder Name: Elon Musk
Account Number: 6039
Balance: $1500000.0

Account Holder Name: Jeff Bezos
Account Number: 6040
Balance: $620000.0

Account Holder Name: Mark Zuckerberg
Account Number: 6041
Balance: $300000.0

Account Holder Name: Pavel Durov
Account Number: 6042
Balance: $100000.0
```
#### قبل خداحافظی از اسپانسر های این تمرین تشکر می‌کنم.
![Untitled-1](https://github.com/user-attachments/assets/ac7d31f7-dde9-4009-9b04-ea3e5e33fad5)
### بدرود بی‌کران!



