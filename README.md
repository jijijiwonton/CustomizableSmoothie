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
How to run non-customized smoothie?

Below is an expected output when running the application!
Welcome to Healthy & Organic Smoothie world
Please, enter your input and enjoy our smoothie!

0 :  Quit program
1 : Order smoothie

1(user input)
2 : Order non-customized smoothie
3 : Order customized smoothie

2(user input)
***** Non-customized smoothie *****
[EchoOfDevils, GreenParty, GreenSun, HappyDessert, RedParty, YellowParty, VitaminBooster]

What would you like to order?
Please enter smoothie number (from 0) :)
2(that needs a feature improvement. This is because that's not comfortable for user to select a smoothie)

***** Non customized smoothie *****
Smoothie    : GreenSun
Ingredients : [Blueberry, Apricot, Peach]
Calories    : 87.0
Price       : $5.3
```

```
How to run customized smoothie?

Below is an expected output when running the application!
Welcome to Healthy & Organic Smoothie world
Please, enter your input and enjoy our smoothie!

0 :  Quit program
1 : Order smoothie
1(user input)
2 : Order non-customized smoothie
3 : Order customized smoothie
3(user input)
[Water, Milk, AlmondMilk, SoyMilk, Acai, Apple, Apricot, Avocado, Banana, BloodOrange, Blueberry, Dates, Kiwi, Lemon, Mango, Peach, Pear]

How many ingredients would you like to put for your smoothie?
5(user input)
Please enter ingredients number (from 0) :)
2(user input)
AlmondMilk
Please enter ingredients number (from 0) :)
6(user input)
Apricot
Please enter ingredients number (from 0) :)
7(user input)
Avocado
Please enter ingredients number (from 0) :)
5(user input)
Apple
Please enter ingredients number (from 0) :)
9(user input)
BloodOrange
Please enter Powder ingredients added or not (from 0) :)
[Nothing, Chocolate, Cinamon, Matcha, Greentea, Ginger]
2(user input)
Please enter Topping ingredients added or not (from 0) :)
[Nothing, Mint]
1(user input)
Please enter Blend level (from 0) :)
[Well_Blended, Less_Blended]
1(user input)
***** Customized smoothie *****
Ingredients : [[AlmondMilk, Apricot, Avocado, Apple, BloodOrange]]
Powder      : [[Cinamon]]
Topping     : [[Mint]]
Blend Level : [[Less_Blended]]
Calories    : 157.0
Price       : $4.3
```
## Trigger

