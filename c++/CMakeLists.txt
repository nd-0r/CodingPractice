cmake_minimum_required(VERSION 3.10)

project("CodingPractice")

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_STANDARD_REQUIRED True)

set(CMAKE_CXX_FLAGS "-Wall -Wextra")
set(CMAKE_CXX_FLAGS_DEBUG "-g")
set(CMAKE_CXX_FLAGS_RELEASE "-O3")

set(EXECUTABLE_OUTPUT_PATH ${CMAKE_CURRENT_SOURCE_DIR}/bin)

list(APPEND SOURCE_FILES src/BinarySearch.cpp
                         src/ClimbingLeaderboard.cpp
                         src/MakeBox.cpp
                         src/NonDivisibleSubset.cpp
                         src/QuickSort.cpp
                         src/TruncatablePrimes.cpp
                         src/DiagonalDifference.cpp
                         src/MagicSquare.cpp
                         src/BiggerGreater.cpp
                         src/ModifiedKaprekarNumbers.cpp
                         src/AbsolutePermutation.cpp
                         src/PE7.cpp
                         src/PE3.cpp)

foreach(src_file ${SOURCE_FILES})
  get_filename_component(executable_name ${src_file} NAME)
  string(REPLACE ".cpp" "" executable_name ${executable_name})
  message("Processing: " ${executable_name})
  add_executable(${executable_name} ${src_file})
endforeach(src_file ${SOURCE_FILES})