// *自定义Task类型*
class MyTask extends DefaultTask {
  @Optional  // 使用该Task 类型时可选参数
  String name = 'my name is default name'

  @TaskAction 
  def test() {
    println "name: $name"
  }
}
