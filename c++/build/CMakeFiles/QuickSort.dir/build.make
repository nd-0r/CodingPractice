# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/local/Cellar/cmake/3.20.2/bin/cmake

# The command to remove a file.
RM = /usr/local/Cellar/cmake/3.20.2/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/andreworals/Documents/Dev/CodingPractice/c++

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/andreworals/Documents/Dev/CodingPractice/c++/build

# Include any dependencies generated for this target.
include CMakeFiles/QuickSort.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/QuickSort.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/QuickSort.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/QuickSort.dir/flags.make

CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o: CMakeFiles/QuickSort.dir/flags.make
CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o: ../src/QuickSort.cpp
CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o: CMakeFiles/QuickSort.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o -MF CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o.d -o CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o -c /Users/andreworals/Documents/Dev/CodingPractice/c++/src/QuickSort.cpp

CMakeFiles/QuickSort.dir/src/QuickSort.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/QuickSort.dir/src/QuickSort.cpp.i"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/andreworals/Documents/Dev/CodingPractice/c++/src/QuickSort.cpp > CMakeFiles/QuickSort.dir/src/QuickSort.cpp.i

CMakeFiles/QuickSort.dir/src/QuickSort.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/QuickSort.dir/src/QuickSort.cpp.s"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/andreworals/Documents/Dev/CodingPractice/c++/src/QuickSort.cpp -o CMakeFiles/QuickSort.dir/src/QuickSort.cpp.s

# Object files for target QuickSort
QuickSort_OBJECTS = \
"CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o"

# External object files for target QuickSort
QuickSort_EXTERNAL_OBJECTS =

../bin/QuickSort: CMakeFiles/QuickSort.dir/src/QuickSort.cpp.o
../bin/QuickSort: CMakeFiles/QuickSort.dir/build.make
../bin/QuickSort: CMakeFiles/QuickSort.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ../bin/QuickSort"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/QuickSort.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/QuickSort.dir/build: ../bin/QuickSort
.PHONY : CMakeFiles/QuickSort.dir/build

CMakeFiles/QuickSort.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/QuickSort.dir/cmake_clean.cmake
.PHONY : CMakeFiles/QuickSort.dir/clean

CMakeFiles/QuickSort.dir/depend:
	cd /Users/andreworals/Documents/Dev/CodingPractice/c++/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++/build /Users/andreworals/Documents/Dev/CodingPractice/c++/build /Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles/QuickSort.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/QuickSort.dir/depend

