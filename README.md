# Convalida

![Logo](logo.png)

Convalida is a simple, lightweight, powerful and annotation-based way to validate fields in Android.

## Why Convalida?

- Annotation-based;
- 100% reflection-free (compile-time);
- Compatible with other annotation-based libraries and frameworks such as [ButterKnife](https://github.com/JakeWharton/butterknife), [AndroidAnnotations](https://github.com/androidannotations/androidannotations), etc...

## Quick Start

First, annotate your fields with [Convalida Annotations](https://github.com/WellingtonCosta/convalida/tree/master/convalida-annotations/src/main/java/convalida/annotations):

```java
@NotEmptyValidation
TextInputLayout nameLayout;

@EmailValidation
TextInputLayout emailLayout;

@PatternValidation(pattern = "^\\([1-9]{2}\\)?([0-9]{9})$")
TextInputLayout phoneLayout;

@PasswordValidation
TextInputLayout passwordLayout;
```

Now, you must init Convalida calling `init()` method:

```java
private ConvalidaValidator validator;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample);
    validator = Convalida.init(this);
}
```

And then, to execute the validations, you must call `validateFields()` method that returns the current validation state:

```java
public void validateFields() {
    boolean isValid = validator.validateFields();
    String message = isValid ? "Is valid!" : "Is not valid!";
    Snackbar.make(linearLayout, message, Snackbar.LENGTH_LONG).show();
}
```

And to clear the fields valitation state, you must call `clearValidations()`:

```java
public void clearFields() {
    validator.clearValidations();
}
```

Download
--------

```groovy
dependencies {
  compile 'br.com.wellingtoncosta:convalida-library:1.0.0'
  annotationProcessor 'br.com.wellingtoncosta:convalida-compiler:1.0.0'
}
```

License
-------

Copyright 2017 Wellington Costa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
