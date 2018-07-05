def element_in_array(element, array)
  if array.include?(element)
    return "#{element} in array"
  else "Not found"
  end
end

puts element_in_array 2, [1, 11, 10]
