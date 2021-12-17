cmake_minimum_required(VERSION 3.19)
project(code C)

set(CMAKE_C_STANDARD 99)

aux_source_directory(src SRC_LIST)

include_directories(include)

add_executable(run ${SRC_LIST} src/linkedList.c)

