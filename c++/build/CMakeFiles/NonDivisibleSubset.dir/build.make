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
include CMakeFiles/NonDivisibleSubset.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/NonDivisibleSubset.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/NonDivisibleSubset.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/NonDivisibleSubset.dir/flags.make

CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o: CMakeFiles/NonDivisibleSubset.dir/flags.make
CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o: ../src/NonDivisibleSubset.cpp
CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o: CMakeFiles/NonDivisibleSubset.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o -MF CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o.d -o CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o -c /Users/andreworals/Documents/Dev/CodingPractice/c++/src/NonDivisibleSubset.cpp

CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.i"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/andreworals/Documents/Dev/CodingPractice/c++/src/NonDivisibleSubset.cpp > CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.i

CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.s"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/andreworals/Documents/Dev/CodingPractice/c++/src/NonDivisibleSubset.cpp -o CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.s

# Object files for target NonDivisibleSubset
NonDivisibleSubset_OBJECTS = \
"CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o"

# External object files for target NonDivisibleSubset
NonDivisibleSubset_EXTERNAL_OBJECTS =

../bin/NonDivisibleSubset: CMakeFiles/NonDivisibleSubset.dir/src/NonDivisibleSubset.cpp.o
../bin/NonDivisibleSubset: CMakeFiles/NonDivisibleSubset.dir/build.make
../bin/NonDivisibleSubset: CMakeFiles/NonDivisibleSubset.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ../bin/NonDivisibleSubset"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/NonDivisibleSubset.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/NonDivisibleSubset.dir/build: ../bin/NonDivisibleSubset
.PHONY : CMakeFiles/NonDivisibleSubset.dir/build

CMakeFiles/NonDivisibleSubset.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/NonDivisibleSubset.dir/cmake_clean.cmake
.PHONY : CMakeFiles/NonDivisibleSubset.dir/clean

CMakeFiles/NonDivisibleSubset.dir/depend:
	cd /Users/andreworals/Documents/Dev/CodingPractice/c++/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++/build /Users/andreworals/Documents/Dev/CodingPractice/c++/build /Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles/NonDivisibleSubset.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/NonDivisibleSubset.dir/depend

