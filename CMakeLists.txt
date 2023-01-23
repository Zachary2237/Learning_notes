cmake_minimum_required(VERSION 3.24)
project(Learning_notes)

set(CMAKE_CXX_STANDARD 14)

include_directories(src/DataStructure)
include_directories(src/DataStructure/src/Chapter1)

add_executable(Learning_notes
        src/CPP/funcTest.cpp
        src/CPP/OtherNameTest.cpp
        src/CPP/ReferenceTest.cpp
        src/CPP/referenceTest1.cpp
        src/CPP/StructTest.cpp
        src/CPP/StructTest2.cpp
        src/CPP/StudentTest.cpp
        src/CPP/Test.cpp
        src/DataStructure/src/Chapter1/LinkList.cpp
        src/DataStructure/src/Chapter1/LinkListHeader.h
        src/DataStructure/src/Chapter1/Predefined.h
        src/DataStructure/src/Chapter1/SqList.cpp
        src/DataStructure/src/Chapter1/SqListHeader.h
        src/DataStructure/SinglyLinkedList.cpp)
