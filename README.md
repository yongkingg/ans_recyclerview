# ans_recyclerview

build.gradle 에 추가할 것

1. 데이터 바인딩 관련


buildFeatures {
        dataBinding = true
        viewBinding = true
    }

2. Glide 관련 


implementation 'com.github.bumptech.glide:glide:4.13.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.13.0'

3. recyclerview 관련


implementation 'androidx.recyclerview:recyclerview:1.1.0'
