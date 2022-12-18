# CustomizableSmoothie

## Author
Jiwon Hwang - Currently QA Software Engineer

## Program Description
A basic Java console program, QA is verified by Junit test.

## Folder Structure
CustomizableSmoothie</br>
&emsp;|CustomizableSmoothie/src</br>
&emsp;&emsp;|Customization</br>
&emsp;&emsp;&emsp;|-Blend.java</br>
&emsp;&emsp;&emsp;|-Customization.java</br>
&emsp;&emsp;&emsp;|-CustomizationTest.java</br>
&emsp;&emsp;&emsp;|-Ingredients.java</br>
&emsp;&emsp;&emsp;|-InternalSystem.java</br>
&emsp;&emsp;&emsp;|-Main.java</br>
&emsp;&emsp;&emsp;|-Menu.java</br>
&emsp;&emsp;&emsp;|-NonCustomization.java</br>
&emsp;&emsp;&emsp;|-NonCustomizationTest.java</br>
&emsp;&emsp;&emsp;|-Order.java</br>
&emsp;&emsp;&emsp;|-OutOfMenuException.java</br>
&emsp;&emsp;&emsp;|-Reference.java</br>
&emsp;&emsp;&emsp;|-SpecialIngredients.java</br>

## Running Application
```
Enum
* Blend.java
* Ingredients.java
* NonCustomization.java

* Customization.java is a publig record that implements menu class
it can get customized smoothie details including ingredients / powder / topping / blendlevel / calories / price</br>
* Ingredients.java class mostly manages ingredients info
* NonCustomization.java is doing the same action like cusomized smoothie class
* Order.java is a model that main.java is calling

Empty classes - not implemented 
* InternalSystem.java 
* SpecialIngredients.java
```

```
How to run non-customized smoothie?</br>

Below is an expected output when running the application! </br>
Welcome to Healthy & Organic Smoothie world</br>
Please, enter your input and enjoy our smoothie!</br>

0 :  Quit program</br>
1 : Order smoothie</br>

1(user input)</br>
2 : Order non-customized smoothie</br>
3 : Order customized smoothie</br>

2(user input)</br>
***** Non-customized smoothie *****</br>
[EchoOfDevils, GreenParty, GreenSun, HappyDessert, RedParty, YellowParty, VitaminBooster]</br>

What would you like to order?</br>
Please enter smoothie number (from 0) :)</br>
2(that needs a feature improvement. This is because that's not comfortable for user to select a smoothie)</br>

***** Non customized smoothie *****</br>
Smoothie    : GreenSun</br>
Ingredients : [Blueberry, Apricot, Peach]</br>
Calories    : 87.0</br>
Price       : $5.3</br>
```

```
How to run customized smoothie?</br>

Below is an expected output when running the application!</br>
Welcome to Healthy & Organic Smoothie world</br>
Please, enter your input and enjoy our smoothie!</br>

0 :  Quit program</br>
1 : Order smoothie</br>
1(user input)</br>
2 : Order non-customized smoothie</br>
3 : Order customized smoothie</br>
3(user input)</br>
[Water, Milk, AlmondMilk, SoyMilk, Acai, Apple, Apricot, Avocado, Banana, BloodOrange, Blueberry, Dates, Kiwi, Lemon, Mango, Peach, Pear]</br>

How many ingredients would you like to put for your smoothie?</br>
5(user input)</br>
Please enter ingredients number (from 0) :)</br>
2(user input)</br>
AlmondMilk</br>
Please enter ingredients number (from 0) :)</br>
6(user input)</br>
Apricot</br>
Please enter ingredients number (from 0) :)</br>
7(user input)</br>
Avocado</br>
Please enter ingredients number (from 0) :)</br>
5(user input)</br>
Apple</br>
Please enter ingredients number (from 0) :)</br>
9(user input)</br>
BloodOrange</br>
Please enter Powder ingredients added or not (from 0) :)</br>
[Nothing, Chocolate, Cinamon, Matcha, Greentea, Ginger]</br>
2(user input)</br>
Please enter Topping ingredients added or not (from 0) :)</br>
[Nothing, Mint]</br>
1(user input)</br>
Please enter Blend level (from 0) :)</br>
[Well_Blended, Less_Blended]</br>
1(user input)</br>
***** Customized smoothie *****</br>
Ingredients : [[AlmondMilk, Apricot, Avocado, Apple, BloodOrange]]</br>
Powder      : [[Cinamon]]</br>
Topping     : [[Mint]]</br>
Blend Level : [[Less_Blended]]</br>
Calories    : 157.0</br>
Price       : $4.3</br>
```
## Trigger

