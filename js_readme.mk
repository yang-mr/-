     一.js基础
     1.数据类型：数值/字符串/数组
     	弱类型: var test = "123";
     		 test = 123;

     2.dom结构：
     	元素节点：如 boy head等
     	文本节点:  元素节点里的内容 如<head> wo name is 文本节点</head>
     	属性节点:  元素节点里的属性 如<p title="wo name is 属性节点"/>

     3.dom常用方法：
     	getElementById()返回一个对象
     	getElementByClassName()
     	getElementByTagName()返回一个对象数组
     	getAtrribute(属性名) 得到属性
     	setAtrribute(属性名，属性值)修改属性()
     	appendChild();
     	createElement()；创建元素节点
     	createTextNote(); 创建文本节点
     	insertBeform();在某元素节点之前插入节点
     	insertAfter();在某元素节点之后插入节点

    二.jquery基础
    1.jquery是数组对象；
    	jquery<=>dom:
    	var $test = $("#id");
    	var dom = $test[0];或 var dom = $test.get(0);

    	var dom = document.getElementById("id");
    	var $jquery = $(dom);

    2.基本选择器，层次选择器，过滤选择器（基本，内容，可见性，属性，子元素，表单对象属性），表单选择器，

    3.Jquery操作DOM；
    	查找节点
    	创建节点
    	插入节点
    	删除节点(remove(), empty())
    	复制节点
    	替换节点
    	包裹节点

  三.jquery事件和动画
  1.事件：
  $(function() {

  })

  1.hover();
  2.toggle();
  3.trigger();自动触发事件

  2.动画：
  show(1000);hide(1000); 隐藏显示

  fadeIn();fadeOut();透明度

  slideDown();slideUp();


