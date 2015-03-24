# Example 1 - Hello Name

This document is a step by step introduction to creating a "Hello, World" app for Android. It also discusses how to extend the app to ask for a name and say hello to it. 

The example starts from an empty project to discuss and introduce all the moving parts.

## 1. Create a new project with no activities

## 2. Create an activity

Activities in Android represent screens in the app. Each app should have at least one Activity. 

In the right package (package explorer), create a new class and name it "Main_activity". Paste the following code into the class and save. This creates an activity (`main_activity`) that is of the type (inheritance) `Activity`. An activity has a number of methods that gets called throughout the (app) life-cycle, such as `onCreate` that gets called when the app is first launched. For now, we only call the superclass to restore any saved app state.

```java
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
```



# 3. Make sure the activity is launched

Once we have a main activity, we need to make sure that it is started when the app is launched. The Android Manifest (`AndroidManifest.xml` in `mainfests`) control a number of things about the app, including which activity is started on launch. 

Paste the following into the `application` element. The attribute `android:name` specifies the name of the class, so this must match whatever you called your activity in the previous step. The initial `.` indicates that the default namespace should be used (so there is no need to specify it). 

```xml
<activity
    android:name=".MainActivity"
    android:label="@string/app_name" >
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

## 4. Create a layout

Each Activity should have a layout that defines how the various widgets are placed within the activity. These can be defined in XML or programmatically.

To define a layout for our main screen, we first need to define a folder for the layouts, `res/layout`. In this folder, we create a Layout resource file named `activity_main`. The layout has a root element that defines how elements should be layed out within the screen. This defines a `ViewGroup` that can contain a number of `View` elements. UI widgets, such as buttons or text views are all view element that can be placed within a viewgroup. We can also place viewgroups within viewgroups to create a hierachical layout structure.

To complete our layout, we add a text view (`TextView`) to the screen. We can predefine the text it should display (`text`) and how it should be placed on the screen (`layout_width` and `layout_height`). `wrap_content` means that the element will be large enough to fit actual content.

Paste the following into the `LinearLayout` element.

```xml
<TextView
    android:text="@string/hello_world"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    />
```

Note that we use a reference to a string (`@string`). This string has to be defined in `values/string.xml`. One benefit to using predefined strings it translation/localization.

```xml
<string name="hello_world">Hello, World!</string>
```

## 5. Load the layout

We now need to connect the layout and the screen. We can do this with the Activity method `setContentView` when the view is created (in the `onCreate` method). Note that we use a string, `R.layout.activity_main` to refer to the layout. The format of this string mirrors the folders and files in the `res` hierarchy.


```java
setContentView(R.layout.activity_main);
```

## 6. Tweak the layout

We can manipulate the layout by modifying the XML layout file, so for many tasks there is no need to modify the source code. For example, to center the text, we add the following to the `TextView` element.

```xml
android:gravity="center"
```

We can also change the size and the weight of the text by adding the following to the `TextView` element.

```xml
android:textSize="42dp"
android:textStyle="bold"
```        

If you want to change other things to the text, use the developer docs or switch to the user interface designer.

## 7. Finishing up hello world

You can now compile and run the app. If you have not already create an Android Virtual Device (AVD), you will be asked to do so now. 

## 8. Hello Name

Ok, we can now show the static text "Hello, World!". Let's allow the user to enter a name and get a nice greeting. To do this, we need to create a few more user interface elements, and add some code to react to changes to these.

## 9. Add a TextField and a Button

We need to add additional elements to the layout, so open the layout file for the main activity. We begin with a field where the user can input text, an `EditText` element. This is similar to the `TextView`, but allows for text input.

```xml
<EditText
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"/>
```

We also need a `Button` that the user can press to indicate that he or she has entered the name. Note that the `android:text` attribute specifies the text of the button, e.g., "Ok" or "Hello".

```xml
<Button
    style="?android:attr/buttonStyleSmall"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```

## 10. Fix the layout

The current layout works, but does not look great, so let's fix it before we move on. We use an additional `LinearLayout` to make the `TextView` and the `Button` appear on the same row. Note that you can place layouts inside other layouts and create a hierachy. Paste the folling into the existing `LinearLayout`, and make sure that the `EditText` and the `Button` is contained by this layout, in that order.

```xml
<LinearLayout
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">
```

We also need to specify how much of the row each elements get. We want the `Button` to be as wide as required, and the `EditText` to use the rest of the space. We can do this by setting the `layoout_width` of the `EditText` to 0 and increase its importance. That way it will take all the remaining space.

```xml
<EditText
    android:layout_width="0dp"
    android:layout_weight="1"
    android:layout_height="wrap_content"
/>
```

## 11. Reacting to button clicks

To be able to react to the button, we need to add some code that gets triggered when the button is clicked. To do this, we need to be able to refer to the button from the Java code. We first create an `id` for the button, something we can refer to in Java. Add the following to the `Button` in the layout for the activity. Note that `helloButton` is just a string, you can call it whatever you want as long as it is unique.

```xml        
android:id="@+id/helloButton"
```

Once we have an `id`, we can use it to find the button from Java using the `findViewById` method. Note that we once again use the resource naming scheme we discussed previously (but this time we want an `id`, not a `layout`). The button has the type 
`Button`, and since `findViewById` can be used for any type of view, we need to cast to the correct type. Note that you also need to declare the variable `helloButton`.

```java
helloButton = (Button) findViewById(R.id.helloButton);        
```

Next we need something that can listen to events, such as a button blick. We use an `OnClickListener` and we need to supply at least an implementation for `onClick`. Note that `onClick` takes a `View` as a parameter. This is the view that generated the click. We also need to attach our listener, `hello`, to the button. We do this via the `Button` method `setOnClickListener`. 

```java
OnClickListener hello = new OnClickListener() {
    @Override
    public void onClick(View v) {

    }
};

helloButton.setOnClickListener(hello);
```

## 12. Setting the text on click

Now that we can react to a button click, we need to find the entered name and display it. The first step is to find the `EditText` and `TextView` from Java. Just like the `Button`, we need to assign ids and get them via the `findViewById` method. Note that you need to declare these `EditText` and `TextView`, and cast the views to the correct type.

Once you have declared the two, you need to grab the entered text from the `EditView` (named `inputText` below) and insert it into the `TextView` (`outputText`). You get the text via the `getText` method. Note that the text needs to be converted to a string. You then use the `setText` method to set the text of the `TextView`. 

```java
String name = inputName.getText().toString();
outputName.setText("Hello, " + name + "!");
```

## 13. All done

You can now compile and run your example. Make sure you play around with the code to understand what is going on. Why not create a second button that changes the color of the text? Or change the layout? ... 